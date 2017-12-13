package tec;


/**
 * Cette interface d�finit un des types abstraits fixant les interactions
 * avec le bus. 
 *
 * Un passager poss�de un nom. Il a trois �tats : dehors, assis, debout. 
 * Dans un bus, un passager est forc�ment soit assis, soit debout. S'il n'est
 * ni assis, ni debout, il est forc�ment dehors. 
 * Quand un passager est cr�e, il est dans l'�tat dehors.
 * Le nom et la destination du passager sont fix�s à l'instanciation.
 * <p>
 * Les m�thodes accepterPlaceAssise(), accepterPlaceDebout(), accepterSortie() 
 * changent l'�tat d'un passager. 
 * <p>
 * A chaque arr�t, la methode nouvelArret() est appel�e par un objet bus.
 * Le passager peut choisir de changer de place ou de sortir du bus.
 * Si le bus accepte la demande, c'est le bus qui d�clenche les modificateurs
 * de passager (les m�thodes comme accepterPlaceDebout()).
 * <p>
 * Quand il arrive à son arr�t de destination, un passager sort du bus.
 */
interface Passager {
  /**
   * fournit le nom de l'usager.
   */
  public String nom();

  /**
   * Retourne vrai si le passager est hors du bus.
   * @return vrai si le passager est hors du bus.
   */
  public boolean estDehors();
  /**
   * Retourne vrai si le passager est assis dans le bus.
   * @return vrai si le passager est assis dans le bus.
   */
  public boolean estAssis();
  /**
   * Retourne vrai si le passager est debout dans le bus.
   * @return vrai si le passager est debout dans le bus.
   */
  public boolean estDebout();

  /**
   * Change l'�tat du passager en hors du bus.
   * Cette m�thode est appel�e par un objet Bus.
   */
  public void accepterSortie();
  /**
   * Change l'�tat du passager en assis. 
   * Le passager est dans le bus.
   * Cette m�thode est appel�e par un objet Bus.
   */
  public void accepterPlaceAssise();
  /**
   * Change l'�tat du passager en debout.
   * Le passager est dans le bus.
   * Cette m�thode est appel�e par un objet Bus.
   */
  public void accepterPlaceDebout();

  /**
   * Indique au passager qu'il est arriv� à un nouvel arrêt. Cette methode
   * fixe le comportement (changer de place ou sortir). 
   * Cette m�thode est appel�e par Bus.
   *
   * @param bus le bus dans lequel se trouve le passager.
   * @param numeroArret numero de l'arrêt.
   */
  public void nouvelArret(Bus bus, int numeroArret);
}

