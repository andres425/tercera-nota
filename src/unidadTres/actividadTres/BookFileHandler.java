package unidadTres.actividadTres;
import java.io.*;
import java.util.List;

public class BookFileHandler {
    private static final String FILA_NAME ="books.txt";
     
    public void saveBooks(List<Book> books){
      try (BufferedWriter bw =new BufferedWriter(new FileWriter(FILA_NAME))) {
        for (Book book : books) {
            bw.write(book.getTitle()+","+book.getAuthor()+","+book.getPrice());
            bw.newLine();
        }
        System.out.println("se guardaron los libros exitosamente ");
      } catch (IOException e) {
       System.out.println("error al gurdar el libro"+e.getMessage());
      }finally{
        System.out.println("se termino la operacion");
      }
    }


    public void readBooks(){
        try (BufferedReader br = new BufferedReader(new FileReader(FILA_NAME))) {
            String line;
            System.out.println("los libros leidos fueron");
            while((line = br.readLine()) != null ){
                String[] parts = line.split(",");
                if (parts.length==3) {
                    String title = parts[0];
                    String author = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    System.out.println(new Book(title,author,price));
                }
            }
        } catch (FileNotFoundException e) {
           System.out.println("no se encontro el archivo "+e.getMessage());
        }catch(IOException e){
            System.out.println("no se pudo leer el libro"+e.getMessage());
        }finally{
            System.out.println("se termino la operacion");
        }
    }
}
