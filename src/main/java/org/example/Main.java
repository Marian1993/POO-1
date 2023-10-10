package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
/*
        Persona toni = new Persona("Toni","Gual",23, new ArrayList<>());
        Persona miquel = new Persona("Miquel","Perez",30,new ArrayList<>());
        Persona clara = new Persona("Clara","Sanso",30,new ArrayList<>());

        Mobil tel1 = new Mobil ("motorola",678556453);
        Mobil tel2 = new Mobil ("samsung",689665321);
        Mobil tel3 = new Mobil ("alcatel",666908778);
        Mobil tel4 = new Mobil ("poco",623112334);

        tel1.setPersona(clara);
        tel2.setPersona(clara);
        tel3.setPersona(toni);

        List<Persona> persones = new ArrayList<>();
        persones.add(toni);
        persones.add(miquel);
        persones.add(clara);



        for (Persona p:persones) {

            System.out.println("Persona " + p.getNom() + " te el següents mobils");

            for (Mobil m :p.getMobil()) {
                System.out.println(m.getModel() + " - " + m.getNum());
            }
        }


        List<Mobil> mobils = new ArrayList<>();
        mobils.add(tel1);
        mobils.add(tel2);
        mobils.add(tel3);

        for (Mobil m :mobils) {

            System.out.println("El mobil " + m.getModel() + " pertany a " + m.getPersona().getNom());
        }




        Moix tara = new Moix("Tara","No",7,false);
        Moix pablo = new Moix("Pablo","Siames",4,true);
        Moix kim = new Moix("Kim","Egipci",9,true);
        Moix lola = new Moix("Lola","Siames",5 ,false);

        /*int comparaTaraPablo = tara.compareTo(pablo);
        int comparaPabloTara = pablo.compareTo(tara);

        System.out.println("Compara Tara Pablo = " + comparaTaraPablo);
        System.out.println("Compara Pablo Tara = " + comparaPabloTara);




        List<Moix> moixos = new ArrayList<>();
        moixos.add(tara);
        moixos.add(pablo);
        moixos.add(kim);
        moixos.add(lola);
        Collections.sort(moixos, new Comparator<Moix>() {
            @Override
            public int compare(Moix o1, Moix o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        });


        //Sap quin metode a d'agafar, perque comparable es una interficie funcional(nomes te un metode),
        //Això es diu lamba (a,b) -> ...., sa feltxa fa de return
        Collections.sort(moixos,((a, b) -> a.getNom().compareTo(b.getNom())));


        //Aquesta es una altre interficie funcional,que ens retorna tots els moixos que tenen menys o igual a 5 anys
        List<Moix> moixosJoves = moixos.stream().filter(m -> m.getEdat() <= 5).toList();

        for (Moix moix:moixosJoves) {
            System.out.println(moix.getNom());
        }


        //LocalDateTime avui = LocalDateTime.of(2023,10,3,10,100);

        try{
            NasaService nasaService = new NasaService();
            nasaService.getAsteroide(null,null);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

 */


    }
}