package arquiteturaCorrecaoSolo.mavem;

/**
 *
 * @author candido
 */
public enum EnumPotassio {
    CLORETO_DE_POTASSIO {
        public double valorElemento() {
            return 58.0;
        }
    },
    SULFATO_DE_POTASSIO {
        public double valorElemento() {
            return 52.0;
        }

    },
    SULFATO_DE_POTASSIO_E_MAGNESIO {
        public double valorElemento() {
            return 22.0;
        }

    };

    public abstract double valorElemento();
}
