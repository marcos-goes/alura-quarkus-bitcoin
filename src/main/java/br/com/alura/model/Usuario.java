package br.com.alura.model;

import io.quarkus.elytron.security.common.BcryptUtil;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@UserDefinition
public class Usuario extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;

    private String nome;

    private String cpf;

    @Username
    private String username;

    @Password
    private String password;

    @Roles
    private String role;

    @JsonbTransient
    public String getPassword(){
        return this.password;
    }

    public static void inserir(Usuario usuario){
        usuario.password = BcryptUtil.bcryptHash(usuario.password);
        usuario.role = validarUsername(usuario.username);
        usuario.persist();
    }

    private static String validarUsername(String username){
        if(username.equals("alura"))
            return "ADMIN";
        return "USER";
    }
}
