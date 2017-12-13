package tec;

/**
 * Cette interface d�finit un des types abstraits fixant les interactions
 * avec les passagers. 
 * <p>
 * Un bus a un nombre d�termine de places assises et de places debouts.
 * Les places assises (ou debout) ne sont pas rep�rables.
 * Le nombre de place assise et bebout est fix� à l'instanciation d'un bus.
 * <p>
 * Un bus authorise  un passager à entrer pour occuper soit une place debout
 * soit une place assise. Si l'entr�e est accept�e le bus d�clenche les 
 * modificateurs de passager (changement de l'�tat du passager).
 * <p>
 * A chaque arr�t, un bus permet aux passagers dans le bus soit de sortir,
 * soit de changer de place (d'assise en debout, ou l'inverse). 
 * Si la demande est accept�e, le bus d�clenche les modificateurs 
 * de passager.
 */

interface Bus {

  /**
   * vrai s'il existe des places assises.
   * @return vrai s'il existe des places assises
   */
  public boolean aPlaceAssise();

  /**
   * vrai s'il existe des places debouts.
   * @return vrai s'il existe des places debouts
   */
  public boolean aPlaceDebout();

  /**
   * Le passager entre dans ce bus en demandant une place assise.
   * L'�tat du passager est forc�ment dehors.
   * Cette m�thode est appel�e par Passager.
   * @param p le passager
   */
  public void demanderPlaceAssise(Passager p);
  /**
   * Le passager entre dans ce bus en demandant une place debout.
   * L'�tat du passager est forc�ment dehors.
   * Cette m�thode est appel�e par passager. 
   * Elle change l'�tat du passager.
   * @param p le passager
   */
  public void demanderPlaceDebout(Passager p);


  /**
   * Change un passager d'une place assise vers une place debout.
   * Elle change l'�tat du passager.
   * @param p le passager avec un �tat assis.
   */
  public void demanderChangerEnDebout(Passager p);

  /**
   * Change un passager d'une place debout vers une place assise.
   * Elle change l'�tat du passager.
   * @param p le passager avec un �tat debout.
   */
  public void demanderChangerEnAssis(Passager p);

  /**
   * Fait sortir un passager du bus.
   * Elle change l'�tat du passager.
   * @param p le passager avec un �tat soit assis soit debout.
   */
  public void demanderSortie(Passager p);
}

