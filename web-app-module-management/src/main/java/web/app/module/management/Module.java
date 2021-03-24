package web.app.module.management;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "module")
@Setter @Getter @NoArgsConstructor
public class Module {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long module_id;
	private String nomModule;
	private int credit;
	private int coefficient;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "module")
	private List<CompModule> compModules;

	public Module(String nomModule, int credit, int coefficient) {
		this.nomModule = nomModule;
		this.credit = credit;
		this.coefficient = coefficient;
	}

	// Add convinience methode
	public void addCompModule(CompModule compModule){
		if (compModules == null){
			compModules = new ArrayList<>();
		}
		compModules.add(compModule);
	}




}
