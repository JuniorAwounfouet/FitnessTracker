-- ============================
-- TABLE : users
-- ============================
INSERT INTO usergym (id, username, password, email, age, weight, height, gender, goal, roles)
VALUES
    (1, 'john_doe', 'password123', 'john@example.com', 28, 75.0, 1.78, 'HOMME', 'PRISE_DE_MASSE', 'USER'),
    (2, 'jane_smith', 'securepass', 'jane@example.com', 25, 60.0, 1.65, 'FEMME', 'PRISE_DE_MASSE', 'USER'),
    (3, 'mike_brown', 'pass1234', 'mike@example.com', 32, 82.5, 1.82, 'HOMME', 'SECHE', 'USER'),
    (4, 'sara_white', 'sara2025', 'sara@example.com', 29, 68.0, 1.70, 'FEMME', 'PRISE_DE_MASSE', 'USER'),
    (5, 'alex_green', 'alexfit', 'alex@example.com', 35, 90.0, 1.85, 'HOMME', 'SECHE', 'USER');

-- ============================
-- TABLE : workouts
-- ============================
INSERT INTO workouts (id, date, type, notes, user_id)
VALUES
    (1, '2025-09-01', 'MUSCU', 'Chest and triceps', 1),
    (2, '2025-09-03', 'CARDIO', 'Treadmill session', 2),
    (3, '2025-09-05', 'MIXTE', 'Full body workout', 3),
    (4, '2025-09-07', 'CARDIO', 'Legs and back', 4),
    (5, '2025-09-09', 'MIXTE', 'Cycling session', 5);

-- ============================
-- TABLE : exercises
-- ============================
INSERT INTO exercises (id, name, muscle_group, sets, reps, weight, workout_id)
VALUES
    (1, 'Bench Press', 'PECS', 4, 10, 60.0, 1),
    (2, 'Triceps Dips', 'BRAS', 3, 12, 0.0, 1),
    (3, 'Treadmill', 'JAMBES', 1, 30, 0.0, 2),
    (4, 'Burpees', 'JAMBES', 4, 15, 0.0, 3),
    (5, 'Squats', 'JAMBES', 4, 12, 80.0, 4),
    (6, 'Cycling', 'JAMBES', 1, 40, 0.0, 5);

-- ============================
-- TABLE : body_measurements
-- ============================
INSERT INTO body_measurements (id, date, weight, body_fat_percentage, chest, waist, arms, user_id)
VALUES
    (1, '2025-09-01', 75.0, 15.5, 95.0, 82.0, 32.0, 1),
    (2, '2025-09-02', 60.5, 20.0, 85.0, 72.0, 28.0, 2),
    (3, '2025-09-03', 82.0, 18.0, 100.0, 88.0, 35.0, 3),
    (4, '2025-09-04', 68.0, 22.0, 90.0, 74.0, 30.0, 4),
    (5, '2025-09-05', 90.0, 17.5, 105.0, 92.0, 37.0, 5);

-- ============================
-- TABLE : meals
-- ============================
INSERT INTO meals (id, name, date, calories, protein, carbs, fats, user_id)
VALUES
    (1, 'Breakfast - Oatmeal with Fruits', '2025-09-01', 450.0, 20.0, 60.0, 12.0, 1),
    (2, 'Lunch - Grilled Chicken Salad', '2025-09-01', 550.0, 40.0, 30.0, 18.0, 2),
    (3, 'Snack - Protein Shake', '2025-09-02', 200.0, 25.0, 10.0, 5.0, 3),
    (4, 'Dinner - Salmon with Rice and Veggies', '2025-09-02', 650.0, 45.0, 50.0, 22.0, 4),
    (5, 'Post-Workout Shake', '2025-09-03', 300.0, 30.0, 20.0, 6.0, 5);
