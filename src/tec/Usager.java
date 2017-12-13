package tec;

/**
 * Cette interface d�finit le type manipul� par le programme principal.
 * <p> 
 * Suivant son caract�re, l'usager choisit a la mont�e une place assise, 
 * debout ou reste dehors.
 * Le transport est charg� d'authoriser cette demande. Si le transport
 * refuse toute demande, le passager reste dehors.
 */
public interface Usager {
  /**
   * fournit le nom de l'usager.
   */
  public String nom();

  /**
   * Fournit � l'usager le transport auquel il peut acc�der.
   * Cette m�thode r�alise le caract�re du passager � la mont�e.
   * 
   * @param t le transport dans lequel d�sire monter l'usager.
   * @throws si l'�tat de l'usager est incoh�rent par rapport � sa demande.
   */
  public void monterDans(Transport t) throws UsagerInvalideException;
}

