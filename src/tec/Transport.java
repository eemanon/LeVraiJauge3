package tec;

/**
 * Cette interface d�finit le type manipule par le programme principal.
 * <p>
 * Un bus a un nombre de places assises et de places debouts.
 * <p>
 * Un Transport voyage d'arr�t en arr�t, il pr�vient ses passagers de chaque
 * nouvel arr�t.
 */
public interface Transport {

  /**
   * Indique au tranport de simuler l'arr�t suivant.
   *
   * @throws si l'�tat du l'usager est incoh�rent par rapport � sa demande.
   */
  public void allerArretSuivant() throws UsagerInvalideException;
}

