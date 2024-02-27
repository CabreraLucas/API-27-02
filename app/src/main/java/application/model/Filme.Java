package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GerenationType;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "filmes")
public class Filme {
    @id@GeneratedValue(strategy = GerenationType.IDENTITY)
    private int id;
    private String titulo;
    
    public void setId(int id){
        this.id = id;
    }
    public void getId(int id){
        return.id = id;
    }
    public String setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(String titulo){
        return.titulo = titulo;
    }
}