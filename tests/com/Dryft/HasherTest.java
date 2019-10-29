package com.Dryft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HasherTest {
    @Test
    void hashPasswordWithSaltTest() {
        String[] passwords = new String[]{"qwerty11098", "password123", "12345678910", "crystal1234"};
        String[] salts = new String[]{"ecabbb812a6e2b13a3e2b534044cb308", "150ccb33e5238fbb76dc2cbaa26e4d25", "291cf1e6e11727538404283cc4f1e42d"};
        String[] hashes = new String[]{
                "35cea9bfe4d27eef6193aad67b0a106e674b6362280f78bfe657509a02efb177",
                "87cc186c58c28fb6231ed5487202420834dedb4f91ab97c1f6bbf80b3f744bd2",
                "5b9d5600a5d188e8a3ac109505bb6a7b9731303f8265d30094c9ac6376b4f2cc",

                "514069f0a38457b10cc6479a9818cafbc4ada432350b013ecceec6457712b31d",
                "43511945f4a817f5910e7674a6484eb5a5fd9716844784ed5c9651b0fe8e5d88",
                "603528ee2704469a6efce8628bc332f69591d244b44d060185db827a31ab2000",

                "627f11fe1963f47bcc1f6ecebee51bab50982b91c3b2dc54dfa85036bb3c9972",
                "b430d2dd151d7053c56edea542c3e0d6c016dfc519bc5ecd459fbb747907dcac",
                "9c44c44006c7dbce56f2ee8c45f58e51a4c0dfae5216d1c9f23ec3aaacccc061",

                "9d25dc2afdec0d80186bc62b4568353bb4ea782a49a05d268e7e4cd92d79dfa9",
                "02ee85bcfcbb05efaee07c811c7a7642edbf642812d42f0d03679246a6f2b8b1",
                "c7c9f97b34617dc6add644d437e1d5b0ca7406e72e5993e905a6209e753da197"
        };
        for (int i = 0; i < passwords.length; i++) {
            for (int j = 0; j < salts.length; j++) {
                Assertions.assertEquals(hashes[i * 3 + j], Hasher.hashPasswordWithSalt(passwords[i], salts[j]));
            }
        }
    }
}
