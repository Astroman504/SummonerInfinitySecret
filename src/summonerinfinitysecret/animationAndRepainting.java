
package summonerinfinitysecret;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

//extendemos de frame porque vamos a realizar una ventana
//implementamos de runnable para poder animar una imageny ahi que implementar los metodos del runnable que
//en  este case en run

public class animationAndRepainting extends JFrame implements Runnable{
    Image buffer;
    Graphics pantallaPrincipal;
    //vamos a crear el hilo del juego
    Thread gameloop;
    
    animationAndRepainting(){ // extendemos nuestra clase y creamos nuetro constructor
        setTitle("Primer juego en java");//colocamos el titulo a la ventana
        setSize(1024,575);
        setVisible(true);//hacwmos la ventana visible
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ESTABLECEMOS opcion para que cierre la ventana
        
        addKeyListener(new KeyAdapter() {// vamos a agregar un elementoq que escuche al teclado y agregamos un  adaptador
                                         //para poder usar solo un metodo de todos los que tiene el keyListenner
        public void keyPressed(KeyEvent e){
        super.keyPressed(e);
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            x+=5;//le decimos si vamos a mover a la derecha 5 pixeles
        }else
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            x+=-5;//le decimos si vamos a mover a la derecha 5 pixeles
        }else
        if(e.getKeyCode()== KeyEvent.VK_UP){
            y+=-5;//le decimos si vamos a mover a la derecha 5 pixeles
        }
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
            y+=5;//le decimos si vamos a mover a la derecha 5 pixeles
        }
        }
        });
       
        gameloop = new Thread(this);
        gameloop.start();//iniciamos el hilo, para correr la animacion
    }
    
    public void paint(Graphics g){
        //creamos el dob();le buffer
        buffer = createImage(getWidth(), getHeight());// creamos la imagen de nuestra pantalla
        pantallaPrincipal = buffer.getGraphics();//vaciamos el contenido a la pantalla
        updatePaint(pantallaPrincipal);
        g.drawImage(buffer, 0, 0, this);//pintamos la imagen del buffer
    
    }
    int x = 50, y = 6;// coordenadas para el circulo inicial
    private void updatePaint(Graphics g) {
    //ahohaa haremos una prueba con un dibujo basico de un circulo
        //y vamos a moverlo con el teclado
        //primero dibujamos el circulo relleno
        g.fillOval(x, y, 60, 60);
    }

    @Override
    public void run() {
Thread t = Thread.currentThread();//indicamos que este hilo es igual al hilo que esta corriendo actualmente
    while(t==gameloop){//mientras sean iguales los hilos vamos a repintar todo el contenido
        try{
            repaint();
            Thread.sleep(20);//20 miliseg. implican 50 fps
        }catch(Exception e){
        
        }
    }
}
    
    
    
    
    
    
    
}
