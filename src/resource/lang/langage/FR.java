package resource.lang.langage;

import resource.lang.Lang;

public class FR extends Lang {
    @Override
    protected String[] getBoutonName() {
        String chooseFile       = "Choisir un fichier";
        String translate        = "Traduire";
        String playTranslate    = "Jouer la traduction";
        String export           = "Exporter";
        String newTranslate     = "Nouvelle traduction";
        String restart          = "Recommencer";

        return new String[] {chooseFile, translate, playTranslate,
                export, newTranslate, restart};
    }

    @Override
    protected String[] getTitleName() {
        String languageToMorse  = "Français vers Morse";
        String languageToL33t   = "Français vers L33t";
        String morseToLanguage  = "Morse vers Français";
        String directTranslate  = "Traduction directe";

        return new String[] {languageToMorse, languageToL33t,
                morseToLanguage, directTranslate};
    }

    @Override
    protected String[] getLabel() {
        String writeRoman  = "Écrire en français";
        String writeMorse  = "Écrire en morse";
        String welcome     = "Bienvenue";
        String title       = "Traducteur";

        return new String[] {writeRoman, writeMorse, welcome, title};
    }

    @Override
    protected String[] getPopUp() {
        String chooseFileTrad  = "Choisissez un fichier texte";
        String chooseFileExport= "Choisissez un répertoire ou exporter votre traduction";



        String popUpSuccesTittle    = "Succès";
        String popUpSuccesName      = "Export";
        String popUpSuccesDesc      = "La traduction a été exportée";

        String popUpErrorTittle     = "Erreur";
        String popUpErrorName       = "Chemin du fichier";
        String popUpErrorDescTrad   = "Sélectionnez dans un premier temps un fichier texte à traduire";
        String popUpErrorDescExport = "Vérifiez qu'un traduction a été effectuée";

        return new String[] {chooseFileTrad, chooseFileExport, popUpSuccesTittle, popUpSuccesName,
                             popUpSuccesDesc, popUpErrorTittle, popUpErrorName, popUpErrorDescTrad, popUpErrorDescExport};
    }

    @Override
    protected String[] getMenu() {
        String menuMenu     = "Menu";
        String menuHelp     = "Aide";
        String menuLangage  = "Langue";
        String menuAbout    = "A propos";
        return new String[] {menuMenu, menuHelp, menuLangage, menuAbout};
    }


}
