# Compléments de programmation - TD 1
     > Namane, Read, 22404690, 8
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions** (cf. [Utilisation d'assertions](https://koor.fr/Java/Tutorial/java_assert.wp)).
À chaque étape, consultez le statut des fichiers du projet (`git status`) ainsi que l'historique (`git log`).

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > Si on décide de cocher une des cases lors de la création du repositery le dépot va être initialiser avec un fichier README,.gitignore ou bien LICENSE,et si l'on décide de ne cocher aucune case on aura accès à un repositery  vide sans aucun commit initiale et des instructions expliquant la méthode de faire son premier repositery or push un  déjà existant 

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`) (cf. [Personnalisation de Git](https://git-scm.com/book/fr/v2/Personnalisation-de-Git-Configuration-de-Git));
    ```bash
    # En essayant de faire un push de notre projet sur le site GitHub, un message est apparu nous demandant de se logger en utilisant notre adresse e-mail ainsi que notre nom dutilisateur GitHub. Les deux commandes utilisées pour compléter ce login sont :

    *git config --global user.email "riadnamane@gmail.com" pour ladresse e-mail
    *git config --global user.name "uvsq22404690" pour mon nom dutilisateur sur GitHub.
    ```
1. Initialisez le dépôt `git` local pour le projet (cf. [Démarrer un dépôt Git](https://git-scm.com/book/fr/v2/Les-bases-de-Git-D%C3%A9marrer-un-d%C3%A9p%C3%B4t-Git));
    ```bash
    # Pour linitialisation du repository, on accède au chemin de notre projet (avec cd C:\Users\riadn\IdeaProjects\TD1_22404690). Ensuite, on utilise la commande git init pour initialiser le repository.
    ```
1. Dans votre IDE, créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet (cf. [Méthode `main`](https://docs.oracle.com/javase/specs/jls/se19/html/jls-12.html#jls-12.1.4));
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements (cf. [Enregistrer des modifications dans le dépôt](https://git-scm.com/book/fr/v2/Les-bases-de-Git-Enregistrer-des-modifications-dans-le-d%C3%A9p%C3%B4t));
    ```bash
    # Pour créer la classe fraction il suffira d'aller dans src et ajouter un fichier classe java que l'on nomme Fraction. le projet compile et s'execute parfaitement avec notre IDE Intellij IDE.
    ```
1. Ajoutez la méthode `toString` à la classe `Fraction` (cf. [`Object.toString`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Object.html#toString())) qui retournera la chaîne `"Je suis une fraction."` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    // Code pour tester toString
    public class Fraction {

    @Override
    public String toString() {
        return "Je suis une fraction.";
    }
}

Pour le fichier main:
public class Main {
    public static void main(String[] args) {

        Fraction fraction = new Fraction();
        System.out.printf(fraction.toString());
    }
}  
    ```
1. Publiez vos modifications sur le dépôt distant (cf. [Travailler avec des dépôts distants](https://git-scm.com/book/fr/v2/Les-bases-de-Git-Travailler-avec-des-d%C3%A9p%C3%B4ts-distants));
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    # Après avoir rajouter la méthode tostring on utilise la commande (git add .) pour ajouter les fichiers mis à jour ensuite on utilise la commande (git commit -m "tostring methode a été ajoutée") en soulignant que notre méthode a été créer, on enchaine avec la commande (git push -u origin main) pour publier les modifications dans le repositery 
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > La syntaxe utilisée pour un fichier README.md est le MARKDOWN
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    # Pour récupèrer les modifications sur la forge on utilise la commande git pull origin main, pour avoir une synchronisation locale et notre repositery dans notre cas on récupère le fichier README quon a créer 
    sur la forge
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (cf. [`.gitignore` pour Java](https://github.com/github/gitignore/blob/main/Java.gitignore));
    ```bash
    # Copier ici le contenu de `.gitignore`
    ### IntelliJ IDEA ###
out/
!**/src/main/**/out/
!**/src/test/**/out/

### Eclipse ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache
bin/
!**/src/main/**/bin/
!**/src/test/**/bin/

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/

### VS Code ###
.vscode/

### Mac OS ###
.DS_Store
    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
     Les fichiers config de lIDE ont bien été supprimer (.idea)
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    # Copier ici les modifications de `.gitignore`
    ### config ###
    .idea/
    ```
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > Expliquez la procédure de façon synthétique
A)Pour configurer l'accès par clé publique/privée à la forge, on commence par exécuter la commande fournie par GitHub : ssh-keygen -t rsa -b 4096 -C "riadnamane@gmail.com". Cette commande génère une clé publique et une clé privée pour notre compte GitHub, en utilisant l'adresse email que nous avons choisie.
B) Pour configurer la clé SSH, on commence par se rendre sur la forge et accéder aux paramètres. Ensuite, on va dans la section SSH and GPG keys et on clique sur New SSH Key. On doit alors copier le contenu de notre clé publique depuis notre fichier .ssh, puis le coller dans le champ prévu sur la forge. Cette étape permet d'établir une connexion sécurisée entre notre machine et notre compte.

## Partie II (à faire durant le TD) : compléter la classe `Fraction`
Dans cet partie, vous compléterez les classes `Fraction` et `Main`.
Un exemple d'interface pour une telle classe est donné par la classe [`Fraction`](http://commons.apache.org/proper/commons-math/javadocs/api-3.6.1/org/apache/commons/math3/fraction/Fraction.html) de la bibliothèque [Apache Commons Math](http://commons.apache.org/math/).

Vous respecterez les consignes ci-dessous :
* chaque méthode de `Fraction` sera testée dans `Main` **avec des assertions** (cf. [Utilisation d'assertions](https://koor.fr/Java/Tutorial/java_assert.wp));
* à la fin de chaque question, consultez le statut des fichiers du projet (`git status`) ainsi que l'historique (`git log`) puis validez les changements.

1. Ajoutez les attributs représentants le numérateur et le dénominateur (nombres entiers).
    ```Java
    // Déclaration des attributs
    public class Fraction {
        private int numerateur;
        private int denominateur;
    }
    ```
1. Ajoutez les constructeurs (cf. [Constructor Declarations](https://docs.oracle.com/javase/specs/jls/se19/html/jls-8.html#jls-8.8)) suivants :
    * initialisation avec un numérateur et un dénominateur,
    * initialisation avec juste le numérateur (dénominateur égal à _1_),
    * initialisation sans argument (numérateur égal _0_ et dénominateur égal à _1_),
    ```Java
    // Création des objets
    Fraction fraction1 = new Fraction(1,2);
    Fraction fraction2 = new Fraction(3);
    Fraction fraction3 = new Fraction();
    // Assertions pour tester les constructeurs (avec toString)
    assert fraction1.toString().equals(fraction2.toString()):"erreur du constructeur";
    assert fraction2.toString().equals(fraction3.toString()):"erreur du constructeur";
    ```
1. Ajoutez les fractions constantes ZERO (0, 1) et UN (1, 1) (cf. [Constants in Java](https://www.baeldung.com/java-constants-good-practices)),
    ```Java
    // Déclaration des constantes
    //Constantes
        final Fraction  fraction4 = new Fraction(0,1);
        final Fraction  fraction5 = new Fraction(1,1);
    ```
1. Ajoutez une méthode de consultation du numérateur et du dénominateur (par convention, en Java, une méthode retournant la valeur de l'attribut `anAttribute` est nommée `getAnAttribute`),
    ```Java
    // Définition des getters
     public int getDenominateur() {
        return this.denominateur;
    }
    public int getNumerateur(){
        return this.numerateur;
    }
    ```
1. Ajoutez une méthode de consultation de la valeur sous la forme d'un nombre en virgule flottante (méthode `doubleValue()`) (cf. [`java.lang.Number`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Number.html)),
   ```Java
    // Assertions pour tester la conversion
     assert fraction5.doubleValue()== 1.0:"La valeur n'a pas été convertie correctement";
     assert fraction4.doubleValue()== 0.0:"La valeur n'a pas été convertie correctement";

    ```
1. Ajoutez une méthode permettant l'addition de deux fractions (la méthode `add` prend en paramètre *une* fraction et *retourne* la somme de la fraction courante et du paramètre),
   ```Java
    // Assertions pour tester l'addition
    assert fraction5.add(fraction4)==1.0:"L'addition est incorrecte";

    ```
1. Ajoutez le test d'égalité entre fractions (deux fractions sont égales si elles représentent la même fraction réduite) (cf. [`java.lang.Object.equals`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object))),
   ```Java
    // Assertions pour tester l'égalité
    assert fraction5.equals(fraction4):"Les fractions ne sont pas égales";
    ```
1. Ajoutez la comparaison de fractions selon l'ordre naturel (cf. [`java.lang.Comparable`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Comparable.html)).
   ```Java
    // Assertions pour tester la comparaison
    assert fraction5.compareTo(fraction4)==0; 
    ```
1. Faites hériter votre classe `Fraction` de la classe [`java.lang.Number`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Number.html) et complétez les méthodes
   ```Java
    // Vérifiez avec le code ci-dessous
    Number aNumber = java.math.BigDecimal.ONE;
    Number anotherNumber = new Fraction(1, 2);
    assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
    

    # On hérite la classe Fraction de java.lang.Number graçe a cette ligne de code : public class Fraction extends java.lang.Number{} en implementant les differentes methodes abstract de cette classe:  
    public int intValue(){
        return this.numerateur / this.denominateur;
    }
    public long longValue(){
        return (long) this.numerateur / this.denominateur;
    }
    public float floatValue(){
        return (float) this.numerateur / this.denominateur;
    }

    en copiant le bloque de code qui nous a été fournie en le collant dans main notre code run parfaitement 
    ```

## Partie III (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    > Command prompt pour le shell et windows 11 pour l'OS
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    # la commande est help, un exemple on peut utiliser help copy qui affiche les détails de cette commande ainsi que des examples sur comment l'utiliser
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        La commande dir /S /O:S /-C permet de trier et dafficher la taille des fichiers dans un dossier, en naviguant vers son chemin à partir de linvite de commandes.
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        dans notre cas de projet pour si on veut compter le nombre de lignes dans notre README File on utilise la commande suivante:

        C:\Users\riadn\IdeaProjects\TD1_22404690>find /c /v "" README.md
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        Dans le cas de notre projet on doit se rendre sur le fichier puis src où on trouve le main.java ensuite on prend le chemin dans notre command prompt, une fois dedans on utilise cette commande pour trouver par example où et quand a été "uneVariable" utiliser

        C:\Users\riadn\IdeaProjects\TD1_22404690\src>findstr "uneVariable" Main.java
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        Pour trouver les fichiers .java ou uneVariable a été utiliser on utilise la commande suivante:
        findstr /S /M "uneVariable" *.java 

        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        On utilise cette commande: dir /S /B README.md qui retourne tout les chemins où se trouve tout les fichiers README.md 

        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        Pour afficher les différences entre deux fichier textes on accèdes au chemin du fichier depuis la command prompt où on utilise la commande FC pour faire differente comparaisons
        fc fichier1.txt fichier2.txt      #afficher les differences entre les fichiers
        fc /C fichier1.txt fichier2.txt   #comparer les fichiers 
        fc /B fichier1.txt fichier2.txt   #comparaison binaire 


        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > La commande ssh (Secure Shell) permet de se connecter de manière sécurisée à un serveur distant via un réseau non sécurisé en utilisant le chiffrement. 
    * `screen`/`tmux`
        > screen et tmux permettent de garder des sessions terminal actives après déconnexion et de gérer plusieurs fenêtres dans un seul terminal, utiles sur des serveurs distants.
    * `curl`/[HTTPie](https://httpie.org/)
        > curl et HTTPie permettent d'envoyer des requêtes HTTP via la ligne de commande. curl est polyvalent et très utilisé pour tester des APIs, tandis qu'HTTPie est plus convivial, avec une syntaxe simplifiée pour interagir facilement avec les APIs REST.
    * [jq](https://stedolan.github.io/jq/)
        > jq permet de manipuler et filtrer des données JSON en ligne de commande, utile pour traiter des réponses API ou des fichiers JSON.

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > Itellij IDEA Community Edition

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > Dans Intellij Idea pour changer l'encodage d'un fichier spécifique il faut se rendre en bas a droite de la fenetre de l'editeur et faire UTF-8
    pour definir l'encodage global du projet il faut aller dans file puis settings ensuite se rendre à file encodings  mettre global encoding UTF-8 comme ça tout les fichiers créer dans le projet utilisent l'encodage de UTF-8
1. Comment choisir le JDK à utiliser dans un projet ?
    > Il faut se rendre dans file puis project structure et choisir le JDK sous l'onglet projet on peut également ajouter un nouveau JDK en cliquant sur new pour installer un nouveau sur notre machine
1. Comment préciser la version Java des sources dans un projet ?
    > File -> Project structure -> Project -> SDK  dans notre cas on a Temurin-21 Eclipse Temurin 21.0.4
1. Comment ajouter une bibliothèque externe dans un projet ?
    > Pour ajouter une bibliothèque externe dans IntelliJ IDEA il suffira d'aller dans File > Project Structure > Libraries, cliquer sur add et puis selectionner Java pour ajouter un fichier Local JAR on choisit la bibliothéque qui sera incluse dans notre projet 
1. Comment reformater un fichier source Java ?
    > pour reformatier un fichier Java src il faudra ouvrir le fichier, allez dans Code > Reformat Code ou utilisez le raccourci Ctrl + Alt + L 
1. Comment trouver la déclaration d'une variable ou méthode ?
    > our trouver la déclaration d'une variable ou méthode dans IntelliJ IDEA, placez le curseur dessus et appuyez sur Ctrl + B 
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Pour insérer un bloc de code prédéfini (snippet) dans IntelliJ IDEA, on tape l'abréviation du snippet et on appuie sur Tab
1. Comment renommer une classe dans l'ensemble du projet ?
    > On utilise la fonctionnalité refactor en entrant le nouveau nom qu'on veut mettre pour tout les variables qui ont le même nom 
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > Pour exécuter un programme Java avec des paramètres dans IntelliJ IDEA, Il suffira d'aller dans Run > Edit Configurations,pui selectioner la configuration, on rentre les paramètres dans Program arguments, et on execute le programme.
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > Pour déboguer et voir la valeur d'une variable dans IntelliJ IDEA, il suffit de placer un point d'arrêt à la ligne souhaitée, de lancer le programme en mode débogage, puis de survoler la variable pour afficher sa valeur ou de jeter un œil au panneau Variables.
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Pour le développement Java, des fonctionnalités comme la complétion de code, le refactoring, le débogage, l'intégration avec des systèmes de versionnage, la gestion des tests unitaires, la gestion des dépendances avec Maven ou Gradle, et l'analyse de code sont particulièrement utiles pour améliorer la productivité et la qualité du code.
