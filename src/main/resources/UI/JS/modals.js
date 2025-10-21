document.addEventListener("DOMContentLoaded", () => {
    const overlay = document.getElementById("modal-overlay");
    const closeBtn = overlay.querySelector(".close-modal");

    closeBtn.addEventListener("click", () => overlay.classList.add("hidden"));
    overlay.addEventListener("click", e => {
        if (e.target === overlay) overlay.classList.add("hidden");
    });
});

export function openModal(content) {
    const overlay = document.getElementById("modal-overlay");
    const modalContent = document.getElementById("modal-content");
    modalContent.innerHTML = content;
    overlay.classList.remove("hidden");
}