package me.dio.creditapplicationsystem.repository

import me.dio.creditapplicationsystem.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface CreditRepository: JpaRepository<Credit, Long>{

    fun findByCreditCode(creditCode: java.util.UUID): Credit?

    @Query(value = "SELECT * FROM CREDIT WHERE Customer_Id = ?1", nativeQuery = true)
    fun findAllByCustomerId(customerId: Long): List<Credit>
}
