# Projet-GO-BUT2-201-BOUVIER-HUANG-HIEGEL

note 17/20 essayez de bien respecter le détail des consignes (diagramme, mettre le lien sur le projet à chaque mail, mettre le groupe de chaque étudiant ...)

Du bon travail mais il faut apprendre à bien respecter les consignes :
- envoi du rapport par mail (interdit cela encombre ma boite) et sans rappel du lien vers le projet (je recois des dizaines de mail sur le projet go)
- diagramme non conforme malgré les explications fournies maintes fois regardez mes corrigés
  

## Projet Jeu de Go

Ce projet est une implémentation du jeu de Go réalisée dans le cadre du cours BUT2-201 à l'Université Rives de Seine. 

## Règles du Jeu
Les règles du jeu de Go peuvent être consultées sur [le site officiel du jeu de Go](https://jeudego.org/_php/regleGo.php).

## Documentation
La documentation pour la norme GTP (Go Text Protocol) peut être trouvée sur les liens suivants :
- [Lysator - GTP](https://www.lysator.liu.se/~gunnar/gtp/)
- [GNU Go - Téléchargement](https://ftp.gnu.org/gnu/gnugo/)

## Auteurs
- HUANG Loïc  @H0o0L
- HIEGEL Oleg @Olltrack
- BOUVIER Charles @lignix

## Commandes

### Commandes de jeu
- `showboard`: Affiche l'état actuel du plateau.
- `clear_board`: Réinitialise le plateau de jeu.
- `boardsize x`: Définit la taille du plateau à x.
- `play color xy`: Effectue un coup de la couleur spécifiée (noir ou blanc) aux coordonnées xy, où xy est une lettre suivie d'un nombre (par exemple, a1, b2, etc.).
- `skip`: Passe le tour du joueur en cours sans effectuer de coup.
- `liberties xy`: Affiche le nombre de libertés de la pierre située aux coordonnées xy.

### Commandes de joueur
- `player color type`: Définit le type de joueur (console, random, etc.) pour la couleur spécifiée.

### Commandes générales
- `quit`: Quitte le jeu.

## Recette Sprint 1
 - Respecter les messages d'erreur standard.
 - Éviter les plantages lors des opérations suivantes :
  - `1 boardsize`.
  - Affichage des scores.
