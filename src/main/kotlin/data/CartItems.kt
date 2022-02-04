package data

// 상품 데이터를 저장
// 프로젝트 전역에서 참조하는 데이터 유지, object 클래스는 객체를 만들지 않고 사용 가능
object CartItems {
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products: Map<Product, Int> = mutableProducts

    fun addProduct(product: Product) {
        mutableProducts[product]?.let {
            mutableProducts[product] = it + 1
        } ?: kotlin.run {
            mutableProducts[product] = 1
        }
    }
}
/*
 * 범위 지정 함수
 * let - 지정된 값이 null이 아닌 경우에 코드를 실행하는 경우
 * also -
 */