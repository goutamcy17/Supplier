package org.supplierframework.supplier.suppliercommand.eventstore;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<SupplierEntry, String> {

    Iterable<SupplierEntry> findAllByOrderByIdAsc();
    SupplierEntry findOneById(String id);
    SupplierEntry findOneBySupplierId(String id);
    @Transactional
    @Modifying
    @Query("update SupplierEntry se set se.supplierId = ?1 where se.supplierId = ?2")
    int setParmaId(String firstname, String lastname);
}
