public class Main {
    public static void main(String[] args) {
        // Étape 1 : Créer l'objet ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // Étape 2, 3 et 4 : Créer un contact et l'ajouter
        Contact ami1 = new Contact();
        ami1.name = "Bamba";
        ami1.phoneNumber = "0103840486";
        myContactsManager.addContact(ami1);

        // Étape 5 : Répéter pour 4 autres contacts
        Contact ami2 = new Contact();
        ami2.name = "Ousmane";
        ami2.phoneNumber = "0708091011";
        myContactsManager.addContact(ami2);

        Contact ami3 = new Contact();
        ami3.name = "Jean";
        ami3.phoneNumber = "0505050505";
        myContactsManager.addContact(ami3);

        Contact ami4 = new Contact();
        ami4.name = "Marie";
        ami4.phoneNumber = "0606060606";
        myContactsManager.addContact(ami4);

        Contact ami5 = new Contact();
        ami5.name = "Awa";
        ami5.phoneNumber = "0404040404";
        myContactsManager.addContact(ami5);

        // Étape 6 : Rechercher et afficher les résultats

        // Recherche n°1 : Bamba
        Contact resultat1 = myContactsManager.searchContact("Bamba");
        if (resultat1 != null) {
            System.out.println("Le numéro de " + resultat1.name + " est : " + resultat1.phoneNumber);
        }

        // Recherche n°2 : Ousmane
        Contact resultat2 = myContactsManager.searchContact("Ousmane");
        if (resultat2 != null) {
            System.out.println("Le numéro de " + resultat2.name + " est : " + resultat2.phoneNumber);
        }
    }
}