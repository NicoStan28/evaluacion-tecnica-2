package src.main.java.com.pil.moby.evaluacion_tecnica.segundo_cuestionario;
import src.main.java.com.pil.moby.evaluacion_tecnica.pojo.Candidato;
import src.main.java.com.pil.moby.evaluacion_tecnica.pojo.Tecnologia;

import java.util.ArrayList;
import java.util.List;

public class EvaluacionTecnica2 {
    public static void main(String[] args) {

        List<Candidato> listaCandidatos = inicializarCandidato();
        resolverPunto1(listaCandidatos);

    }

    public static List<Candidato> inicializarCandidato() {
        Tecnologia SQL = new Tecnologia(3, "SQL");
        Tecnologia java = new Tecnologia(1, "Java");
        Tecnologia angular = new Tecnologia(2, "Angular");
        Tecnologia nodeJs = new Tecnologia(8, "NodeJS");
        Tecnologia mongoDb = new Tecnologia(7, "MongoDB");
        Tecnologia noSql = new Tecnologia(4, "NoSQL");
        Tecnologia vue = new Tecnologia(5, "Vue");
        Tecnologia net = new Tecnologia(6, ".NET");

        List<Tecnologia> tecJhon = new ArrayList<>();
        tecJhon.add(java);
        tecJhon.add(angular);
        tecJhon.add(SQL);

        List<Tecnologia> tecOta = new ArrayList<>();
        tecOta.add(nodeJs);
        tecOta.add(java);
        tecOta.add(SQL);

        List<Tecnologia> tecTaglia = new ArrayList<>();
        tecTaglia.add(mongoDb);
        tecTaglia.add(noSql);

        List<Tecnologia> tecMc = new ArrayList<>();
        tecMc.add(vue);
        tecMc.add(SQL);
        tecMc.add(java);

        List<Tecnologia> tecDep = new ArrayList<>();
        tecDep.add(java);

        List<Tecnologia> tecDiMaria = new ArrayList<>();
        tecDiMaria.add(java);
        tecDiMaria.add(angular);
        tecDiMaria.add(SQL);

        List<Tecnologia> tecMessi = new ArrayList<>();
        tecMessi.add(SQL);
        tecMessi.add(vue);
        tecMessi.add(java);

        List<Tecnologia> tecJulian = new ArrayList<>();
        tecJulian.add(noSql);
        tecJulian.add(mongoDb);
        tecJulian.add(SQL);
        tecJulian.add(java);

        List<Tecnologia> tecMartinez = new ArrayList<>();
        tecMartinez.add(net);
        tecMartinez.add(java);
        tecMartinez.add(angular);

        List<Tecnologia> tecDybala = new ArrayList<>();
        tecDybala.add(java);
        tecDybala.add(net);
        tecDybala.add(angular);


        Candidato jhonDoe = new Candidato(3, "Jhon", "Doe", 2, 5000, tecJhon);
        Candidato matOta = new Candidato(7, "Matias", "Otamendi", 9, 3000, tecOta);
        Candidato joTaglia = new Candidato(1, "Joaquin", "Tagliafico", 6, 2000, tecTaglia);
        Candidato gastonMc = new Candidato(4, "Gastón", "Mac Allister", 1, 5000.50, tecMc);
        Candidato pabloDePaul = new Candidato(5, "Pablo", "De Paul", 4, 9000.50, tecDep);
        Candidato lucDiMaria = new Candidato(2, "Lucas", "Di Maria", 7, 6000, tecDiMaria);
        Candidato lioMessi = new Candidato(10, "Lionel", "Messi", 10, 10000.10, tecMessi);
        Candidato julianAlvarez = new Candidato(9, "Julian", "Alvarez", 3, 5000, tecJulian);
        Candidato lulaMartinez = new Candidato(8, "Lula", "Martinez", 2, 1000, tecMartinez);
        Candidato agusDybala = new Candidato(6, "Agustin", "Dybala", 2, 1000, tecDybala);

        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(jhonDoe);
        candidatos.add(matOta);
        candidatos.add(joTaglia);
        candidatos.add(gastonMc);
        candidatos.add(pabloDePaul);
        candidatos.add(lucDiMaria);
        candidatos.add(lioMessi);
        candidatos.add(julianAlvarez);
        candidatos.add(lulaMartinez);
        candidatos.add(agusDybala);

        return candidatos;
    }



    public static void resolverPunto1(List<Candidato> candidatos) {

        System.out.println("\n-ID----Nombre----Apellido------Pretension Salarial-----------Años de Experiencia-----------------Tecnologias-------");
        //System.out.println("\n-------------------------------------------------------------------------------------------------ID-------Nombre-Tec------");

        while (!candidatos.isEmpty()) {

            Candidato print = candidatos.getFirst();


            System.out.println("\n " + print.getId() + "     " + print.getNombre() + "       " + print.getApellido() + "             " + print.getSalario() + "                       " + print.getAniosExperiencia() + "                       " + "    ID        Nombre      ");

            List<Tecnologia> tecs = print.getTecnologias();
            while (!tecs.isEmpty()) {

                Tecnologia tech = tecs.getFirst();

                System.out.println("\n                                                                                                 " + tech.getId() + "         " + tech.getNombre());

                tecs.remove(tech);
            }

            candidatos.remove(print);
            System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
        }
    }

}