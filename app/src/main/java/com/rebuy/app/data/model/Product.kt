package com.rebuy.app.data.model

data class Product(
    val id: String,
    val title: String,
    val price: Int,
    val location: String,
    val timeAgo: String,
    val imageUrl: String,
    val brand: String,
    val condition: ProductCondition,
    val status: ProductStatus = ProductStatus.AVAILABLE,
    val chatCount: Int = 0,
    val likeCount: Int = 0,
    val viewCount: Int = 0,
    val isLiked: Boolean = false
)

enum class ProductCondition(val label: String, val grade: String) {
    MINT("Mint", "S"),
    EXCELLENT("Excellent", "A"),
    GOOD("Good", "B"),
    FAIR("Fair", "C")
}

enum class ProductStatus {
    AVAILABLE,
    RESERVED,
    SOLD,
    INACTIVE
}

// Mock data similar to web app
object MockProducts {
    val products = listOf(
        Product(
            id = "1",
            title = "Fender American Professional II Stratocaster",
            price = 2850000,
            location = "Seoul, Gangnam",
            timeAgo = "2 hours ago",
            imageUrl = "https://images.unsplash.com/photo-1564186763535-ebb21ef5277f?w=400",
            brand = "Fender",
            condition = ProductCondition.EXCELLENT,
            chatCount = 5,
            likeCount = 12,
            viewCount = 156
        ),
        Product(
            id = "2",
            title = "Gibson Les Paul Standard '50s",
            price = 3200000,
            location = "Seoul, Hongdae",
            timeAgo = "5 hours ago",
            imageUrl = "https://images.unsplash.com/photo-1510915361894-db8b60106cb1?w=400",
            brand = "Gibson",
            condition = ProductCondition.MINT,
            chatCount = 8,
            likeCount = 24,
            viewCount = 289
        ),
        Product(
            id = "3",
            title = "PRS Custom 24 10-Top",
            price = 4500000,
            location = "Busan, Haeundae",
            timeAgo = "1 day ago",
            imageUrl = "https://images.unsplash.com/photo-1516924962500-2b4b3b99ea02?w=400",
            brand = "PRS",
            condition = ProductCondition.EXCELLENT,
            chatCount = 3,
            likeCount = 18,
            viewCount = 201
        ),
        Product(
            id = "4",
            title = "Ibanez RG550 Genesis Collection",
            price = 1450000,
            location = "Seoul, Itaewon",
            timeAgo = "2 days ago",
            imageUrl = "https://images.unsplash.com/photo-1550985616-10810253b84d?w=400",
            brand = "Ibanez",
            condition = ProductCondition.GOOD,
            chatCount = 2,
            likeCount = 9,
            viewCount = 98
        ),
        Product(
            id = "5",
            title = "Music Man John Petrucci Majesty",
            price = 5200000,
            location = "Incheon",
            timeAgo = "3 days ago",
            imageUrl = "https://images.unsplash.com/photo-1525201548942-d8732f6617a0?w=400",
            brand = "Music Man",
            condition = ProductCondition.MINT,
            chatCount = 6,
            likeCount = 31,
            viewCount = 342
        ),
        Product(
            id = "6",
            title = "Fender Jazz Bass American Ultra",
            price = 2650000,
            location = "Seoul, Mapo",
            timeAgo = "4 days ago",
            imageUrl = "https://images.unsplash.com/photo-1629732674198-bd346bb87e3c?w=400",
            brand = "Fender",
            condition = ProductCondition.EXCELLENT,
            chatCount = 4,
            likeCount = 15,
            viewCount = 178
        ),
        Product(
            id = "7",
            title = "Roland TD-17KVX Electronic Drum Kit",
            price = 1890000,
            location = "Seoul, Gangnam",
            timeAgo = "5 days ago",
            imageUrl = "https://images.unsplash.com/photo-1519892300165-cb5542fb47c7?w=400",
            brand = "Roland",
            condition = ProductCondition.GOOD,
            chatCount = 7,
            likeCount = 22,
            viewCount = 267
        ),
        Product(
            id = "8",
            title = "Korg Minilogue XD Synthesizer",
            price = 780000,
            location = "Daegu",
            timeAgo = "1 week ago",
            imageUrl = "https://images.unsplash.com/photo-1598488035139-bdbb2231ce04?w=400",
            brand = "Korg",
            condition = ProductCondition.FAIR,
            chatCount = 1,
            likeCount = 6,
            viewCount = 89
        )
    )
}
