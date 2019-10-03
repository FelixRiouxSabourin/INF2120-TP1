/* Il va y avoir de l'heritage
 * On va utiliser scanner
 * A certains intervalles d'une fonction, on veut regarder la valeur equivalente.
 * Sampling: echantionnage. On recoit un fichier avec toutes les echantillions.
 * Le but: faire un re-echantionage. Entre chaque echantillions on veut rajouter
 *      plus de details, plus d'echantions.
 * Il y aura 3 techniques que l'utilisateur du programme pourra choisir afin de faire
 *      l'echantionage. D'ou la mechanique d'heritage.
 *  1. Lineaire     : approximer avec une ligne entre les deux points.
 *           Δi = yi+1 - yi
 *           Δi * t + yi
 *  2. Quadratique  : trouver l'equation d'une parabole a l'aide de trois points et
 *      approximer les points entre.
 *           Δi = yi+1 - yi
 *           Δi+1 = yi+2 - yi+1
 *           Δ2i =  Δi+1 -  Δi
 *            a =  Δ2i/2h
 *            b =  Δi/h - a(xi+xi+1)
 *            c = yi - xib-xi^2a
 *            ax^2 + bx + c
 *  3. le troisieme va etre dans l'ennonce
 *
 * Il y aura quelques classes:
 *      3 classes, une pour chaque techniques
 *      1 super-classe qui chapautera les 3 techniques, qui regrouppera les methodes generiques a chaque classes.
 *          il faut se concentrer sur cette super-classe pour le tp afin d'eviter la repetition de code.
 * Trucs :
 *      - essayer de se concentrer sur les classes de techniques au debut en ecrivant ce qui est
 *          unique pour celles ci au debut du tp.
 *      - ne pas se gener a mettre des classes, meme si elles ont etre supprimees plus tard.
 * Ponderation : 11% de la note finale.
 *      - Structure : 1.5 pts
 *          - A eviter : 0.5 pts
 *              - continue;
 *              - GoTo;
 *              - pas de breaks a l'exterieur d'un switch;
 *              - pas plus de 1 return par methodes.
 *              - au total pas plus de 7 x {if, for, while, switch, try} par methodes.
 *      - Lisibilite : 2 pt
 *              - identificateurs significatifs,
 *              - en francais
 *              - commentaires d'entete de methodes AVANT la ligne de code.
 *                      Une ligne contient SOIT du code SOIT un commentaire, pas les deux.
 *      - Fonctionalite du programme : 7 pts
 *              - si le programme ne fonctionne pas, c'est 0 sur 7.
 * Au demarrage :
 *      1. on demarre le programme
 *      2. on entre le nom d'un fichier (nom.txt)
 *      3. on entre un int 1, 2, ou 3. qui represente la technique.
 *      4. doubles seront affiches, a une valeur par ligne?
 *      5. Le programme ne doit pas demander de faire un autre
 *
 * Les validations :
 *      1. est-ce que le fichier existe? Sinon, message d'erreur, arret
 *      2. La premiere valeur doit etre un int entre 1 et 3.
 *      3.
 *
 */

/*
NOTES:
1. Lecture du nom d'un fichier
2. Lecture des entres dans le fichier
3. Validation: est-ce que le fichier a une entree par ligne?
4. La premiere valeur: entier entre 1 et 3
5.

 */

