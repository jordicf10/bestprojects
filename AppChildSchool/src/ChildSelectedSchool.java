import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class ChildSelectedSchool {
	
		public static int idsiguiente;
		
		
		
		public static void main(String[] args) {

			ArrayList<Persona> lista=new ArrayList<Persona>();
			
			ArrayList<Persona> lista2=new ArrayList<Persona>();
			
			ArrayList<Persona> lista3=new ArrayList<Persona>();
			
			
			
			Persona p1= new Persona(26708, 40);
			Persona p2= new Persona(125488, 80);
			Persona p3= new Persona(61929, 40);
			Persona p4= new Persona(26530, 70);
			Persona p5= new Persona(68246, 70);
			Persona p6= new Persona(12097, 70);
			Persona p7= new Persona(105030, 70);
			Persona p8= new Persona(149871, 40);
			Persona p9= new Persona(129349, 40);
			Persona p10= new Persona(60794, 80);
			Persona p11= new Persona(44053, 70);
			Persona p12= new Persona(61740, 70);
			Persona p13= new Persona(64673, 70);
			Persona p14= new Persona(15525, 70);
			Persona p15= new Persona(39233, 70);
			Persona p16= new Persona(113896, 70);
			Persona p17= new Persona(6591, 70);
			Persona p18= new Persona(146106, 40);
			Persona p19= new Persona(118451, 70);
			Persona p20= new Persona(27571, 70);
			Persona p21= new Persona(138597, 70);
			Persona p22= new Persona(35485, 70);
			
			
			
			Persona p23= new Persona(40254, 30);
			Persona p24= new Persona(72141, 30);
			Persona p25= new Persona(56282, 30);
			Persona p26= new Persona(61322, 30);
			Persona p27= new Persona(57217, 30);
			Persona p28= new Persona(68392, 30);
			Persona p29= new Persona(83348, 30);
			Persona p30= new Persona(62584, 30);
			Persona p31= new Persona(51014, 30);
			Persona p32= new Persona(37829, 30);
			Persona p33= new Persona(39073, 30);
			Persona p34= new Persona(56380, 30);
			Persona p35= new Persona(40023, 30);
			Persona p36= new Persona(36901, 30);
			Persona p37= new Persona(82402, 30);
			Persona p38= new Persona(42197, 30);
			Persona p39= new Persona(34487, 30);
			Persona p40= new Persona(65761, 30);
			Persona p41= new Persona(70097, 30);
			
			
			Persona p42= new Persona(147069, 30);
			Persona p43= new Persona(146421, 30);
			Persona p44= new Persona(6007, 0);
			Persona p45= new Persona(85417, 15);
			Persona p46= new Persona(25786, 30);
			Persona p47= new Persona(136596, 30);
			Persona p48= new Persona(153176, 30);
			Persona p49= new Persona(111545, 30);
			Persona p50= new Persona(15450, 30);
			Persona p51= new Persona(111284, 30);
			Persona p52= new Persona(128494, 30);
			Persona p53= new Persona(137744, 30);
			Persona p54= new Persona(122774, 30);
			Persona p55= new Persona(98241, 30);
			Persona p56= new Persona(21387, 30);
			Persona p57= new Persona(152201, 30);
			Persona p58= new Persona(114099, 30);
			Persona p59= new Persona(116228, 30);
			Persona p60= new Persona(128494, 30);
			Persona p61= new Persona(101613, 30);
			Persona p62= new Persona(148982, 30);
			Persona p63= new Persona(26830, 30);
			Persona p64= new Persona(115248, 30);
			Persona p65= new Persona(537, 30);
			Persona p66= new Persona(83940, 30);
			Persona p67= new Persona(96547, 30);
			Persona p68= new Persona(84156, 30);
			Persona p69= new Persona(30250, 30);
			Persona p70= new Persona(139570, 30);
			Persona p71= new Persona(24745, 30);
			Persona p72= new Persona(98257, 30);
			Persona p73= new Persona(147916, 30);
			
			
			
			
			
			
			lista.add(p1);
			lista.add(p2);
			lista.add(p3);
			lista.add(p4);
			lista.add(p5);
			lista.add(p6);
			lista.add(p7);
			lista.add(p8);
			lista.add(p9);
			lista.add(p10);
			lista.add(p11);
			lista.add(p12);
			lista.add(p13);
			lista.add(p14);
			lista.add(p15);
			lista.add(p16);
			lista.add(p17);
			lista.add(p18);
			lista.add(p19);
			lista.add(p20);
			lista.add(p21);
			lista.add(p22);
			
			
			lista2.add(p23);
			lista2.add(p24);
			lista2.add(p25);
			lista2.add(p26);
			lista2.add(p27);
			lista2.add(p28);
			lista2.add(p29);
			lista2.add(p30);
			lista2.add(p31);
			lista2.add(p32);
			lista2.add(p33);
			lista2.add(p34);
			lista2.add(p35);
			lista2.add(p36);
			lista2.add(p37);
			lista2.add(p38);
			lista2.add(p39);
			lista2.add(p40);
			lista2.add(p41);
			lista2.add(p49);
			lista2.add(p51);
			lista2.add(p55);
			lista2.add(p58);
			lista2.add(p61);
			lista2.add(p66);
			lista2.add(p67);
			lista2.add(p68);
			lista2.add(p72);
			
			
			
			lista3.add(p42);
			lista3.add(p43);
			lista3.add(p46);
			lista3.add(p47);
			lista3.add(p48);
			lista3.add(p50);
			lista3.add(p52);
			lista3.add(p53);
			lista3.add(p54);
			lista3.add(p56);
			lista3.add(p57);
			lista3.add(p59);
			lista3.add(p60);
			lista3.add(p62);
			lista3.add(p63);
			lista3.add(p64);
			lista3.add(p65);
			lista3.add(p69);
			lista3.add(p70);
			lista3.add(p71);
			lista3.add(p73);
			lista3.add(p44);
			lista3.add(p45);
			
			
			
			
			Collections.sort(lista);
			Collections.sort(lista2);
			Collections.sort(lista3);
			
			System.out.println("-----------Alumnos con 40 puntos o más-----------");
			System.out.println();
			
			for(Persona e:lista) {
				idsiguiente++;
				int id=idsiguiente;
				if (e.getNumero()==149871) {
					
					System.out.println("Posición " + id + " : " +  e.getNumero() + " tiene " + e.getPuntos() + " puntos JORDI JESSICA " );
				}


				else {
				System.out.println("Posición " + id + " : " +  e.getNumero() + " tiene " + e.getPuntos() + " puntos");
			}
			}
			
			System.out.println();
			System.out.println("-----------Alumnos con 30 puntos-----------");
			System.out.println();
			
			for(Persona e:lista2) {
				idsiguiente++;
				int id=idsiguiente;
				if (e.getNumero()==83348) {
					
					System.out.println("Posición " + id + " : " +  e.getNumero() + " tiene " + e.getPuntos() + " puntos ÈRIC COLOMER MILLÁN " );
				}


				else {
				System.out.println("Posición " + id + " : " +  e.getNumero() + " tiene " + e.getPuntos() + " puntos");
		
				}
				
			}
			
			System.out.println();
			System.out.println("-----------Alumnos no agraciados-----------");
			System.out.println();
			
			for(Persona e:lista3) {
				idsiguiente++;
				int id=idsiguiente;
				System.out.println("Posición " + id + " : " +  e.getNumero() + " tiene " + e.getPuntos() + " puntos");
			}
			}
			

		}





