BEGIN
  FOR rec IN (SELECT LoanID, InterestRate, Customers.DOB
                FROM Loans
                JOIN Customers ON Loans.CustomerID = Customers.CustomerID)
  LOOP
    IF MONTHS_BETWEEN(SYSDATE, rec.DOB)/12 > 60 THEN
      UPDATE Loans
      SET InterestRate = InterestRate - 1
      WHERE LoanID = rec.LoanID;
    END IF;
  END LOOP;
  COMMIT;
END;
/