/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.Gimnasio.repositorio;

import Reto3.Gimnasio.interfac.InterfaceAdmin;
import Reto3.Gimnasio.modelo.Admin;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author johan
 */
@Repository
public class RepositorioAdmin {
    @Autowired
    private InterfaceAdmin adminCrudRepository;
    
    public List<Admin> getAll(){
        return (List<Admin>) adminCrudRepository.findAll();
    }
    
    public Optional<Admin> getAdmin(int id){
        return adminCrudRepository.findById(id);
    }   
  
    public Admin save(Admin admin){
        return adminCrudRepository.save(admin);
    }
    
    public void delete(Admin admin){
         adminCrudRepository.deleteById(admin.getIdAdmin());
    }
}