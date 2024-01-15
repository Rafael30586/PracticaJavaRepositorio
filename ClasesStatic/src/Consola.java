public class Consola {

    private Control control;

    private static class Control{
        int botonesCantidad;
        String colorEstandar;

        private Control(int botonesCantidad, String colorEstandar) {
            this.botonesCantidad = botonesCantidad;
            this.colorEstandar = colorEstandar;
        }

        public int getBotonesCantidad() {
            return botonesCantidad;
        }

        public void setBotonesCantidad(int botonesCantidad) {
            this.botonesCantidad = botonesCantidad;
        }

        public String getColorEstandar() {
            return colorEstandar;
        }

        public void setColorEstandar(String colorEstandar) {
            this.colorEstandar = colorEstandar;
        }
    }

    public Control crearControl(int botonesCantidad, String colorEstandar){

        if(this.control==null){
            return new Control(botonesCantidad,colorEstandar);
        }else{
            return this.control;
        }

    }

    public Control getControl() {
        return control;
    }
}
