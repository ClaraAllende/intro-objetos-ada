package pepitaReloaded.state;

import pepitaReloaded.Golondrina;

public class Euforica implements Estado {
    public void deseoCumplido(Golondrina golondrina) {
        golondrina.volar(5);
    }
}
