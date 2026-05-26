# ReceiverDemo

> Application Android démontrant l'utilisation des `BroadcastReceiver`
> dynamiques, statiques et personnalisés en Java pur.

![Platform](https://img.shields.io/badge/platform-Android-green)
![Language](https://img.shields.io/badge/language-Java-orange)
![MinSDK](https://img.shields.io/badge/minSdk-24-blue)
![Component](https://img.shields.io/badge/component-BroadcastReceiver-purple)

## Objectif pédagogique

Ce lab a pour objectif de comprendre le fonctionnement des `BroadcastReceiver`
dans une application Android.

## Demo video


https://github.com/user-attachments/assets/06c960e2-d92a-4566-8167-8e921ef925fc


Il permet de maîtriser :

- la création d’un `BroadcastReceiver` dynamique ;
- la création d’un `BroadcastReceiver` statique ;
- l’envoi et la réception d’un broadcast personnalisé ;
- le rôle de `Intent`, `IntentFilter` et `onReceive()` ;
- la différence entre un receiver déclaré dans le code et un receiver déclaré dans le `AndroidManifest.xml`.

## Fonctionnalités

| Fonctionnalité | Description |
|---|---|
| Receiver dynamique | Détecte l’activation ou la désactivation du mode avion |
| Receiver statique | Réagit à l’événement `BOOT_COMPLETED` après le démarrage du téléphone |
| Broadcast custom | Envoie un broadcast interne depuis `MainActivity` |
| Toast | Affiche un message visuel quand un broadcast est reçu |
| Logcat | Permet de vérifier le fonctionnement du `BootReceiver` |

