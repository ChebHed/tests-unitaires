/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author admin
 */
public class Calculatrice {
    public Double calculer(double nb1, double nb2, char operateur) {
Double resultat = null;
switch (operateur) {
case '+':
resultat = nb1 + nb2;
break;
case '-':
resultat = nb1 - nb2;
break;
case '*':
resultat = nb1 * nb2;
break;
case '/':
if (nb2 != 0)
resultat = nb1 / nb2;
break;
}
return resultat;
}
}
