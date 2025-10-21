import { openModal } from "./modals.js";
import { showToast } from "./ui.js";

document.addEventListener("DOMContentLoaded", () => {
    showToast("Welcome to Hotel Operations Dashboard!", "success");

    // Example modal trigger
    setTimeout(() => {
        openModal("<h3>System Tip</h3><p>Use the tabs above to manage operations.</p>");
    }, 1500);
});