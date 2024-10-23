import java.util.ArrayList;
import java.util.List;

class Student {
    private int nota;

    public Student(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }
}

class Universitate {
    private List<Student> note;

    public Universitate() {
        this.note = new ArrayList<>();
    }

    public void adaugaNota(Student nota) {
        note.add(nota);
    }

    public void scoateNota(Student nota) {
        note.remove(nota);
    }

    public void afiseazaNote() {
        for (Student nota : note) {
            System.out.println(nota);
        }
    }

    public int rotunjesteNota(Student nota) {
        /*
        int numar = 1;
        while (nota.getNota() > numar) {
            numar *= 5;
            if (nota.getNota() == numar || nota.getNota() < numar - 2) {
                return nota.getNota();
            }
        }
        return numar;
        */
        int multiple = ((nota.getNota() / 5) + 1) * 5;
        if (multiple - nota.getNota() <= 2) {
            return multiple;
        }
        else {
            return nota.getNota();
        }
    }

    public void afiseazaNotePicate() {
        for (Student nota : note) {
            if (nota.getNota() < 40) {
                System.out.print(nota.getNota() + " ");
            }
        }
        System.out.println();
    }

    public void afiseazaMediaNotelor() {
        int suma = 0;
        for (Student nota : note) {
            suma += nota.getNota();
        }
        suma /= note.size();
        System.out.println(suma);
    }

    public void rotunjesteNotele() {
        for (Student nota : note) {
            System.out.print(rotunjesteNota(nota) + " ");
        }
        System.out.println();
    }

    public void notaMaximaRotunjita() {
        int max = 0;
        for (Student nota : note) {
            if (rotunjesteNota(nota) > max) {
                max = rotunjesteNota(nota);
            }
        }
        System.out.println(max);
    }
}

public int numarMinim(int[] lista) {
    int min = lista[0];
    for (int i = 1; i < lista.length; i++) {
        if (lista[i] < min) {
            min = lista[i];
        }
    }
    return min;
}

public int numarMaxim(int[] lista) {
    int max = lista[0];
    for (int i = 1; i < lista.length; i++) {
        if (lista[i] > max) {
            max = lista[i];
        }
    }
    return max;
}

public int sumaMaxima(int[] lista) {
    int numar_minim = numarMinim(lista);
    int total_sum = 0;
    for (int i = 0; i < lista.length; i++) {
        total_sum += lista[i];
    }
    return total_sum - numar_minim;
}

public int sumaMinima(int[] lista) {
    int numar_maxim = numarMaxim(lista);
    int total_sum = 0;
    for (int i = 0; i < lista.length; i++) {
        total_sum += lista[i];
    }
    return total_sum - numar_maxim;
}

public int ceaMaiIeftinaTastatura(int[] lista) {
    int min = lista[0];
    for (int i = 1; i < lista.length; i++) {
        if (lista[i] < min) {
            min = lista[i];
        }
    }
    return min;
}

public int celMaiScumpProdus(int[] lista1, int[] lista2) {
    int max = lista1[0];
    for (int i = 1; i < lista1.length; i++) {
        if (lista1[i] > max) {
            max = lista1[i];
        }
    }
    for (int i = 0; i < lista2.length; i++) {
        if (lista2[i] > max) {
            max = lista2[i];
        }
    }
    return max;
}

public int celMaiScumpProdusCumparat(int buget, int[] lista) {
    int max = lista[0];
    for (int i = 1; i < lista.length; i++) {
        if (lista[i] > max && lista[i] <= buget) {
            max = lista[i];
        }
    }
    return max;
}

public int celeMaiScumpeProduseCumparate(int buget, int[] lista1, int[] lista2) {
    int max1 = 0;
    int max2 = 0;
    for (int i = 0; i < lista1.length; i++) {
        for (int j = 0; j < lista2.length; j++) {
            if (lista1[i] + lista2[j] <= buget) {
                max1 = lista1[i];
                max2 = lista2[j];
            }
        }
    }
    return max1 + max2;
}

public int[] suma(int[] lista1, int[] lista2) {
    int [] lista3 = {};
    for (int i = 0; i < lista1.length; i++) {
        lista3[i] = lista1[i] + lista2[i];
        if (lista1[i] + lista2[i] > 10) {
            lista3[i] = (lista1[i] + lista2[i]) % 10;
        }
    }
    return lista3;
}

public int[] scaderea(int[] lista1, int[] lista2) {
    int[] lista3 = {};
    for (int i = 0; i < lista1.length; i++) {
        lista3[i] = lista1[i] - lista2[i];
        if (lista1[i] - lista2[i] < 0) {
            lista3[i] = (lista1[i] + lista2[i]) % 10;
            lista3[i - 1] -= 1;
        }
    }
    return lista3;
}

public void main(String[] args) {
    Student s1 = new Student(29);
    Student s2 = new Student(37);
    Student s3 = new Student(38);
    Student s4 = new Student(41);
    Student s5 = new Student(84);
    Student s6 = new Student(67);
    Universitate universitate = new Universitate();
    universitate.adaugaNota(s1);
    universitate.adaugaNota(s2);
    universitate.adaugaNota(s3);
    universitate.adaugaNota(s4);
    universitate.adaugaNota(s5);
    universitate.adaugaNota(s6);
    universitate.afiseazaMediaNotelor();
    universitate.afiseazaNotePicate();
    universitate.rotunjesteNotele();
    universitate.notaMaximaRotunjita();
    int[] lista = {4, 8, 3, 10, 17};
    System.out.println(numarMinim(lista));
    System.out.println(numarMaxim(lista));
    System.out.println(sumaMinima(lista));
    System.out.println(sumaMaxima(lista));
    int[] tastaturi1 = {40, 35, 70, 15, 45};
    System.out.println(ceaMaiIeftinaTastatura(tastaturi1));
    int[] tastaturi2 = {15, 20, 10, 25};
    int[] stickuri_usb1 = {20, 15, 40, 15};
    System.out.println(celMaiScumpProdus(tastaturi2, stickuri_usb1));
    int[] stickuri_usb2 = {15, 45, 20};
    int buget1 = 30;
    System.out.println(celMaiScumpProdusCumparat(buget1, stickuri_usb2));
    int[] tastaturi3 = {60};
    int[] stickuri_usb3 = {8, 12};
    int buget2 = 60;
    System.out.println(celeMaiScumpeProduseCumparate(buget2, tastaturi3, stickuri_usb3));
    int[] lista1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
    int[] lista2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
    //System.out.println(scaderea(lista1, lista2));
}



