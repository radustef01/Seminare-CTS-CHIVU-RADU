package composite.clase;

public interface UnitateBancara {
    void adaugaUnitate(UnitateBancara unitateBancara);
    void stergereUnitate(UnitateBancara unitateBancara);
    UnitateBancara getUnitate(int index);
    void printUnitate(String indentare);
}
