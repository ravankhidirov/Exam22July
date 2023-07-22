package task_2

class PaymentService {

    fun sendPayment(iPayment: IPayment){
        iPayment.processPayment()
    }
}