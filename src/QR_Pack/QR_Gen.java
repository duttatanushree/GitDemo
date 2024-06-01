package QR_Pack;






import java.io.*;


public class QR_Gen {

	public static void main(String[] args) {
		try {
				File f=new File("C:\\Users\\Tanushree Dutta\\Desktop\\abc.jpg");
				String content="this is my content";
				ByteArrayOutputStream out=QRCode.from(content).to(ImageType.JPG).stream();
				FileOutputStream fos=new FileOutputStream(f);
				fos.write(out.toByteArray());
				fos.close();
				System.out.println("Success");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
