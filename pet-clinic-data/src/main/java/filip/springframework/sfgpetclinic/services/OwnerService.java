package filip.springframework.sfgpetclinic.services;

import filip.springframework.sfgpetclinic.model.Owner;

public interface  OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
