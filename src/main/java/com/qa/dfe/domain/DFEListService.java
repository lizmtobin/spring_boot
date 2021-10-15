package com.qa.dfe.domain;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Primary
//@Service // Spring makes an instance of this class
public class DFEListService implements DFEService {

	private List<Marsupial> marsupials = new ArrayList<>();

	private final Logger logger = LoggerFactory.getLogger(DFEListService.class);

	@Override
	public Marsupial getMarsupialByIndex(Integer id) {
		return this.marsupials.get(id);
	}

	@Override
	public List<Marsupial> getAllMarsupials() {
		return this.marsupials;
	}

	@Override
	public Marsupial createMarsupial(Marsupial marsupial) {
		logger.info("CREATED MARSUPIAL: {}",marsupial);
		this.marsupials.add(marsupial);
		return this.marsupials.get(this.marsupials.size() - 1);
	}

	@Override
	public Marsupial updateMarsupial(Marsupial marsupial, Integer id) {
		logger.info("UPDATED MARSUPIAL: {}",marsupial);
		logger.info("ID: {}",id);
		return this.marsupials.set(id, marsupial); // replaces the marsupial at that index
	}

	@Override
	public void deleteMarsupial(Integer id) {
		Marsupial toDelete = this.marsupials.get(id);
		this.marsupials.remove(toDelete);
	}

}
