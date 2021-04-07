
package arquiteturaCorrecaoSolo.mavem;

/**
 *
 * @author candido
 */
public enum EnumFosforo {
    SUPERFOSFATO_SIMPLES{
        public double valorFonteFosforo(){
            return 18.0;
        }
    },
    SUPERFOSFATO_TRIPLO{
        public double valorFonteFosforo(){
            return 41.0;
        }
    },
    MAP{
        public double valorFonteFosforo(){
            return 48.0;
        }
    },
    DAP{
      public double valorFonteFosforo(){
          return 45;
      }  
    },
    TERMOFOSTATO_YOORIN{
        public double valorFonteFosforo(){
            return 18.0;
        }
    },
    FOSFATO_REAT_ARAD{
        public double valorFonteFosforo(){
            return 33.0;
        }
    },
    FOSFATO_REATIVO_GAFSA{
        public double valorFonteFosforo(){
            return 29.0;
        }
    },
    FOSFATO_REATIVO_DAOUI{
        public double valorFonteFosforo(){
            return 32.0;
        }
    },
    FOSF_NAT_PATOS_DE_MINAS{
        public double valorFonteFosforo(){
            return 24.0;
        }
    },
    ESCORIA_DE_THOMAS{
        public double valorFonteFosforo(){
            return 18.5;
        }
    },
    ACIDO_FOSFORICO{
        public double valorFonteFosforo(){
            return 52.0;
        }
    },
    MULTIFOSFATO_MAGNESIANO{
        public double valorFonteFosforo(){
            return 18.0;
        }
    };
    
    public abstract double valorFonteFosforo();
}
