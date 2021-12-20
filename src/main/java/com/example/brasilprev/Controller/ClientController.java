package com.example.brasilprev.Controller;

import com.example.brasilprev.Model.Client;
import com.example.brasilprev.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClientController {

    @Autowired
    private ClientService clientService;


    /**
     * Method to return a list of clients
     * @return all clients
     */
    @GetMapping
    public List<Client> findAll(){
        return clientService.findAll();
    }


    /**
     * Method that returns the client found by your ID
     * @param id of the client that will be found
     * @return a client if found
     */
    @GetMapping("/{id}")
    public Optional<Client> findById(@PathVariable Integer id){
        return clientService.findById(id);
    }


    /**
     * Method to add the user on the list
     * @param client that will be updated
     * @return the client that was added to the list
     */
    @PostMapping
    public Client add(@RequestBody Client client){
        return clientService.add(client);
    }


    /**
     * Method to delete the client by Id
     * @param id of the client to be deleted
     */
    @DeleteMapping ("/{id}")
    public String delete(@PathVariable Integer id){
        clientService.delete(id);
                return "Product with id:" + id + " was successfully deleted!";
    }


    /**
     * Method to update the client to the list
     * @param client that will be updated
     * @return the client after updating the list
     */
    @PutMapping("/{id}")
    public Client update(@RequestBody Client client, @PathVariable Integer id){
            return clientService.update(id, client);
    }

}
