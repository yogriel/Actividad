package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String lastname;
    private String surname;
    private String RFC;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    @ColumnName("apellido_materno")
    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    @ColumnName("RFC")
    public String getRFC(){
        return RFC;
    }

    public void setRFC(String RFC){
        this.RFC = RFC;
    }
}