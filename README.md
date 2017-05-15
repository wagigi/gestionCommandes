# gestionCommandes

T�l�charger le projet.

D�compresser le projet.

Utiliser la commande : gradlew (dans un terminal � la ra�inne du projet). A la premi�re execution cette commande prend du temps car elle commence par t�l�charger le gestionnaire de librairies Gradle, puis elle t�l�charge toutes les librairies du framework Spring, et elle compile de projet.

Utiliser la commende : gradlew eclipse (dans un terminal � la ra�inne du projet) pour convertir le projet en un projet eclipse.

Importer le projet dans Eclipse pour pouvoir �diter le code : File -> Import -> Existing project into workspace -> ...

Lancer le Web Services : le main Java se trouve dans src/main/java/reservations/GestionCommandesApplications. Lancer en tant qu'application Java.

Utiliser un navigateur avec un plugin (postman ou rest client) pour tester le web service :

	- Envoyer un HTTP POST sur l'URL http://localhost:8080/reservations contenant du json pour ajouter une commande :  {"typeProduit": 1, "nombreProduits":3}  Ne pas oublier de pr�ciser dans le header http content-type: application/json.
	
	- Envoyer un HTTP GET sur l'URL http://localhost:8080/reservations ayant comme header http content-type: application/json pour r�cup�rer la liste des reservations.