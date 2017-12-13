package tec;

/** 
 * Cette exception est lev�e pour indiquer qu'un usager n'a pas pu �tre pris en compte
 * par un transport. 
 * <p>
 * Soit le transport ne contient pas cet usager. Soit l'�tat de l'usager (assis/debout/dehors) 
 * est incoh�rent avec sa demande au transport.
 */
public class UsagerInvalideException extends Exception {
  public final Usager quelUsager;
  public final Transport quelTransport;

  /**
   * Construit l'exception avec le message d'erreur fourni. Ce message est recup�r�
   * par la methode getMessage() d�finie dans la classe Throwable. 
   */
  UsagerInvalideException(String message) {
    this(message, null, null);
  }

  /**
   * Construit l'exception avec le message d'erreur fourni en pr�cisant l'usager 
   * et le transport en cause.
   */
  UsagerInvalideException(String message, Usager u, Transport t) {
      super(message);
      quelTransport = t;
      quelUsager = u;
  }
}
