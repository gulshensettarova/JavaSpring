package com.company.spring_technology.Notes.Example;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

public class ManualTransaction {
    private final TransactionTemplate transactionTemplate;

        public ManualTransaction(PlatformTransactionManager transactionTemplate) {
        this.transactionTemplate = new TransactionTemplate(transactionTemplate);
    }
    public void processOrder() {
        transactionTemplate.execute(status -> {
            try {
                // Tranzaksiya daxilində əməliyyatlar
                saveOrder();
                updateInventory();

                // Əgər hər şey uğurla keçərsə, tranzaksiya avtomatik commit olacaq
                return null; // Uğurlu tranzaksiya
            } catch (Exception e) {
                // Tranzaksiya uğursuz olduqda rollback
                status.setRollbackOnly();
                throw e; // Tranzaksiyanı geri almaq üçün exception atırıq
            }
        });
    }

    public void saveOrder() {
        // Sifarişin saxlanılması əməliyyatı
    }

    public void updateInventory() {
        // Stokun yenilənməsi əməliyyatı
    }
}
