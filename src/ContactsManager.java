class ContactsManager {
    Contact[] myFriends;
    int friendsCount;

    // Constructeur par défaut (établit les valeurs de base)
    ContactsManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}