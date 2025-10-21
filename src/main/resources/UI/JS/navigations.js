document.addEventListener("DOMContentLoaded", () => {
    const navButtons = document.querySelectorAll(".nav-btn");
    const sections = document.querySelectorAll(".dash-section");

    navButtons.forEach(btn => {
        btn.addEventListener("click", () => {
            navButtons.forEach(b => b.classList.remove("active"));
            btn.classList.add("active");

            const sectionId = btn.getAttribute("data-section");
            sections.forEach(sec => {
                sec.classList.toggle("hidden", sec.id !== sectionId);
            });
        });
    });
});