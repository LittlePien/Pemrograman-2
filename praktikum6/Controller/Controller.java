package praktikum6.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import praktikum6.Modul.Mahasiswa;

public class Controller {
	@FXML
	private TableView<Mahasiswa> tblMahasiswa;
	@FXML
	private TableColumn<Mahasiswa, String> ColNim;
	@FXML
	private TableColumn<Mahasiswa, String> ColNama;
	
	private ObservableList<Mahasiswa> data;
	
	public void initialize() {
		ColNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
		ColNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
		
		data = FXCollections.observableArrayList(
				new Mahasiswa(1, "A. Malik Fajar Putra Syamsi", "2424242424"),
				new Mahasiswa(2, "M. Rizki Dinar", "6767676767"),
				new Mahasiswa(3, "Sebastian Abe Santoso", "2121212121"),
				new Mahasiswa(4, "Arya Arroza Ridho Syaputra", "1919191919"),
				new Mahasiswa(5, "Muhammad Irgi Fahreza", "6969696969"),
				new Mahasiswa(6, "Muhammad Kusuma", "1818181818"),
				new Mahasiswa(7, "Noor Muhammad Akmal Sulaiman", "1010101010"),
				new Mahasiswa(8, "M. Naufal Khalish", "1616161616"),
				new Mahasiswa(9, "Rizki Adhitya Maulana", "5050505050"),
				new Mahasiswa(10, "Muhammad Naufal Abdillah", "1212121212")
				);
		
		tblMahasiswa.setItems(data);
	}
}