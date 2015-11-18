package obtenirparaulesalatzar;

public class ObtenirParaulesAlAtzar {

    public static void main(String[] args) {
        
        ObtenirParaulesAlAtzar programa=new ObtenirParaulesAlAtzar();
        programa.inici();
        
    }
    
    private  void  inici (){
          String [] diccionari = {
            "a" , "abadessa" , "abandonat" , "abarnegat" , "abat" , "abatussat" , "abissal" , "abnegat" ,
             "abrainat" , "abruptesa" , "abscissa" , "absolut" , "abstreure" , "acabar" , "acampar" ,
             "accent" , "acer" , "acerat" , "acid" , "aclamar" , "aclarir" , "aclarit" , "acrata" ,
             "acrobacia" , "adagi" , "adaptar" , "adeptes" , "adequar" , "adequat" , "adeu" , "adherir" ,
             "admetre" , "adonar" , "adormir" , "adscriure" , "adust" , "advers" , "advocat" , "afanar" ,
             "afany" , "afavorir" , "afavorit" , "afebleix" , "afeblit" , "afectat" , "afectiu" , "afectuos" ,
             "afegir" , "afer" , "afilar" , "afinar" , "afi" , "afligir" , "afligit" , "aflorar" , "afluent" ,
             "afluixar" , "agafar" , "agalla" , "agata" , "agencia" , "agrair" , "agrait" , "agrari" , "agre" ,
             "agregar" , "agror" , "aguila" , "ah" , "ahir" , "aigua" , "aiguat" , "aire" , "aixada" , "aixafar" ,
             "aixecar" , "aixeta" , "aixella" , "aixi" , "aixo" , "aixovar" , "ajeure" , "ajornar" ,
             "ajudar" , "ajupir" , "ajustar" , "ala" , "albada" , "albi" , "ale" , "alenar" ,
             "alevi" , "alga" , "algid" , "algu" , "alie" , "alla" , "alli" , "allo" , "alma" , "alpi" ,
             "altivesa" , "amagar" , "amanida" , "amanir" , "ambre" , "amorf" , "ample" , "ampliar" ,
             "anar" , "anca" , "angoixa" , "anis" , "ansa" , "apagar" , "apagat" , "apercebre" ,
             "apostata" , "arbre" , "aristòcrata" , "atreure" , "audiofon" , "autocrata" ,
             "baixa" , "bali" , "bandol" , "barata" , "barbar" , "barrera" , "bassal" , "bata" ,
             "benveure" , "benviure" , "bestraure" , "bobila" , "bossarrera" , "bravata" , "bufor" ,
             "cabre" , "caixa" , "calabre" , "calibre" , "canelobre" , "cantata" , "carabassal" , "carrera" ,
             "casal" , "caure" , "causa" , "celebre" , "censal" , "centaure" , "cercavila" , "circumscriure" ,
             "clamar" , "clar" , "cloure" , "codol" , "colossal" , "columnata" , "comensal" , "commoure" ,
             "complaure" , "concloure" , "condol" , "contramarc" , "contrapès" , "contreure" ,
             "convilatà" , "conviure" , "corbata" , "correra" , "coure" , "creure" , "cuixa" , "culata" ,
             "data" , "decaure" , "de" , "decebre" , "deixa" , "descloure" , "descriure" , "desfilar" ,
             "deslliurat" , "desviure" , "detreure" , "deure" , "distreure" , "egagropila" , "embeure" ,
             "emfasi" , "empes" , "entreploure" , "entreveure" , "errata" , "es" , "escandol" , "escarlata" ,
             "escata" , "escaure" , "espes" , "excloure" , "extasi" , "extreure" , "fe" , "febre" , "fetge" ,
             "fila" , "fluixa" , "fragata" , "frenopata" , "funebre" , "gaiata" , "gebre" , "glabre" ,
             "gramofon" , "heretgia" , "hipotesi" , "homofon" , "horabaixa" , "i" , "idol" , "incloure" ,
             "inscriure" , "jeure" , "licorera" , "lleure1" , "llibre" , "lliure" , "lúgubre" , "magnetofon" ,
             "malveure" , "manobre" , "marbre" , "membre" , "microfon" , "minotaure" , "moure" , "nombre" ,
             "o" , "olla" , "onda" , "onada" , "or" , "orca" , "orfebre" , "pagar" , "pagat" , "paper" , "paraula" ,
             "pebre" , "piga" , "plaure" , "plorar" , "ploure" , "pobre" , "postdata" , "prescriure" , "preveure" ,
             "promoure" , "prorrompre" , "proscriure" , "public" , "pulcre" , "pupitre" , "que" , "queixa" , "readmetre" ,
             "recloure" , "regata" , "reixa" , "remoure" , "retreure" , "rivetaire" , "romandre" , "sabata" , "sabre" ,
             "safata" , "salubre" , "serenata" , "sobreviure" , "sostreure" , "subscriure" , "tabac" , "tabal" , "tacar" , 
             "tacat" , "tacit" , "tacte" , "tactica" , "tactil" , "talar" , "tall" , "talla" , "tallar" , "talos" , 
             "talp" , "tambe" , "tampo" , "tanca" , "tanc" , "tapar" , "tapat" , "tapia" , "tarda" , "tasca" , 
             "tassa" , "taula" , "tauro" , "taxa" , "tebia" , "tecla" , "telefon" , "timbre" , "vaca" , "vacu" , 
             "vaga" , "vago" , "vall" , "vampir" , "vandal" , "vanova" , "vapor" , "vaquer" , "variar" , 
             "variat" , "vector" , "vedell" , "vegada" , "vei" , "veinal" , "veinat" , "vel" , "velada" , 
             "veler" , "vell" , "vena" , "vencer" , "vençut" , "venda" , "vendre" , "venial" , "venjar" , 
             "venjat" , "venosa" , "vent" , "ventar" , "ventre" , "verb" , "verd" , "veri" , "vers" , "veto" , 
             "veu" , "viure" , "vorera"
        };
        
         String [] prova = obtenirParaulesALAtzar (diccionari, 30);
         
         for (int i = 0; i <prova.length; i ++) {
            System.out.println(" -"+prova [i]);
            
            // System.out.print (prova [i]);
             //System.out.print (",");
         }
    }
    
    /**
     * 
     * Obte paraules el atzar desde el diccionari
     * @param paraules
     * @param numero_lletres
     * @return 
     */
    private String[] obtenirParaulesALAtzar(String[] paraules, int numero_lletres){
        
        String[] paraulesDiccionari;
        //Gener posicions aleatoris no repites
        int[] posicions=generarPosicions(paraules.length);
        String[] paraulesAuxiliar=new String[numero_lletres];
        //Utilizat per el aray posicions
        int index_posicions=0;
        //Igual que el anterior pero se utiliza per el de paraules Auxiliar
        int index=0;
        //Conta les lletres
        int numlletres=0;
        //Conta les paraules a mesura que anam insertant
        int numParaules=0;
        int suma;
        //S'executa fins que arriba a 30
        while(numlletres<30){
            //Agaf els catacters actuals i els sum a la longitud de la proxima paraula
            suma=(numlletres+paraules[posicions[index_posicions]].length());
            
            if(suma<=numero_lletres){
                paraulesAuxiliar[index]=paraules[posicions[index_posicions]];
                numlletres+=paraules[posicions[index_posicions]].length();
                index++;
                numParaules++;
            }
            index_posicions++;
           
        }
       
        paraulesDiccionari=new String[numParaules];
        for(int i=0;i<paraulesDiccionari.length;i++){
            paraulesDiccionari[i]=paraulesAuxiliar[i];
        }
        
        return paraulesDiccionari;
    }
    /**
     * Gener numeros aleatoris per desordenar les lletres
     * @param maxim
     * @return 
     */
    public int[] generarPosicions(int maxim){
    
        int[] numeros=new int[maxim];
        
        for(int i=0;i<numeros.length;i++){
            numeros[i]=-1;
        }
        
        int numero;
        int index=0;
        boolean existeix;
        
        do{
            numero=generaNumeroAleatorio(0,maxim-1);
            
            existeix=false;
            for(int i=0;i<numeros.length && !existeix;i++){
                if(numero==numeros[i]){
                    existeix=true;
                }
            }
            
            if(!existeix){
                numeros[index]=numero;
                index++;
            }
        }while(existeix || index!=maxim);
        
        return numeros;
        
    }  
    
    /**
     * Genera un numero aleatori
     * @param minim
     * @param maxim
     * @return 
     */
    public int generaNumeroAleatorio(int minim, int maxim){
         
        int num=(int)Math.floor(Math.random()*(minim-(maxim+1))+(maxim+1));
        return num;
    } 
    
}
