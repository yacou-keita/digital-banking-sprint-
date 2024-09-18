package ci.djonan.digital_baking_backend.dtos;



import ci.djonan.digital_baking_backend.enums.AccountStatus;
import lombok.Data;

import java.util.Date;



@Data
public  class SavingBankAccountDTO extends BankAccountDTO{
    private String id;
    private String name;
    private double balance;
    private Date createAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
