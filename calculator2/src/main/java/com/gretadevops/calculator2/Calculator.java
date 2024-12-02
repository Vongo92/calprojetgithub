package com.gretadevops.calculator2;

import org.springframework.stereotype.Service;

// @Service est une annotation qui définit calculator comme
// étant un service qui sera instancié au démarrage de cette
// application dans le conteneur spring, et donc la méthode
// sum (voir plus bas) sera exposée et elle pourra être 
// appelée.
@Service
public class Calculator {
    // ceci est un commentaire. Ci dessous, on définit une méthode
    // qui prend deux entiers, a et b, et retourne leur somme.
    int sum(int a, int b) {
        return (a + b);
    }
}