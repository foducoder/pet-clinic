package jagrat.springframework.petclinic.services;

import jagrat.springframework.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
     Owner findByLastName(String lastName);
}
