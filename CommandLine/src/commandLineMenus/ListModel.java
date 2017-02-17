package commandLineMenus;

import java.util.List;

/**
 * Permet de gérer les listes. C'est-à-dire : affecter une action au choix d'un élément 
 * dans une liste, et actualiser les éléments de la liste devant être affichée.
 */

public interface ListModel<T>
{
	/**
	 * Fonction permettant de rafraîchir la liste juste avant de l'afficher.
	 * @returns la liste des éléments parmi lesquels la sélection devra 
	 * se faire.
	 */
	
	public List<T> getList();
}
