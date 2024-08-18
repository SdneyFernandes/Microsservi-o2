package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author fsdney
 */


@Data
@Document(collection = "clientes")
public class Cliente {

    @Id
    private String id;
    private String nome;
    private String email;
    private String telefone;
	public void setId(String id2) {
		// TODO Auto-generated method stub
		
	}
}
