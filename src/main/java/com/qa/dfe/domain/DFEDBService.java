package com.qa.dfe.domain;

import com.qa.dfe.persistence.MarsupialRepository;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DFEDBService implements DFEService {

	private final MarsupialRepository repo;

	public DFEDBService(MarsupialRepository repo) {
		this.repo = repo;
	}

	@Override
	public Marsupial getMarsupialByIndex(Integer id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Marsupial not found"));
	}

	@Override
	public List<Marsupial> getAllMarsupials() {
		// SELECT * FROM marsupial;
		return repo.findAll();
	}

	@Override
	public Marsupial createMarsupial(Marsupial marsupial) {
		return repo.save(marsupial);
	}

	@Override
	public Marsupial updateMarsupial(Marsupial marsupial, Integer id) {
		// NEVER TRY AND CHANGE THE ID
		Marsupial toUpdate = repo.findById(id).orElseThrow(() -> new RuntimeException("Marsupial not found"));

		toUpdate.setColour(marsupial.getColour());
		toUpdate.setName(marsupial.getName());
		toUpdate.setSpecies(marsupial.getSpecies());

		return repo.save(toUpdate);
	}

	@Override
	public void deleteMarsupial(Integer id) {
		repo.deleteById(id);
	}

}
