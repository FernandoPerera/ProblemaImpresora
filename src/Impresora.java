import list.GenericQueue;

public class Impresora {
    private boolean estado = false;

    private GenericQueue<Documento> colaImpresion = new GenericQueue<Documento>();

    Documento trabajo = new Documento();

    public boolean isEstado() {
        return estado;
    }

    public void encenderImpresora() {
        System.out.println("\n\t································");
        System.out.println("\tSe esta encendiendo la impresora");
        System.out.println("\t································");

        estado = true;
    }

    public void apagarImpresora() {
        System.out.println("\n\t···························");
        System.out.println("\tSe esta apagando la impresora");
        System.out.println("\t·····························");

        estado = false;
    }

    public void añadirTrabajo() {
        if (!estado){
            String out = "\n\t------------------";
            out += "\n\tLa impresora no puede recibir trabajos está apagada";
            out += "\n\t------------------\n";

            System.out.println(out);
        } else {
            colaImpresion.enqueue(trabajo.generarDocumento());

        }
    }

    public void verTrabajos() {

        if (!estado){
            String out = "\n\t------------------";
            out += "\n\tLa impresora no puede recibir trabajos está apagada";
            out += "\n\t------------------\n";

            System.out.println(out);
        } else {
            for (int i = 0; i < colaImpresion.size(); i++) {
                System.out.println("\t--  " + colaImpresion.get(i));
            }
        }
    }

    public Documento imprimir() {
        return colaImpresion.dequeue();
    }
}
